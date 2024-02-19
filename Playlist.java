// Surname: Mujovo
// Name: Paulos
// Student no: 4125570
// Course: CSC211
// Year: 2023
// Assignment: Practical 1 Term 2
// File: Playlist.java

import java.util.*;

public class Playlist {
    private Node root;
    private int size;
    
    public Playlist() {
        root = null;
        size = 0;
    }
    
    public Node getRoot() {
        return root;
    }
    
    public int getSize() {
        return size;
    }
    
    public void setRoot(Node root) {
        this.root = root;
    }
    
    public void setSize(int size) {
        this.size = size;
    }
    
    public void clear() {
        root = null;
        size = 0;
    }
    
    public boolean search(String title) {
        return search(root, title);
    }
    
    private boolean search(Node node, String title) {
        if (node == null) {
            return false;
        } else if (title.equals(node.track.getTitle())) {
            return true;
        } else if (title.compareTo(node.track.getTitle()) < 0) {
            return search(node.left, title);
        } else {
            return search(node.right, title);
        }
    }
    
    public void insert(String title, String artist, String album, int minutes, int seconds) {
        Track track = new Track(title, artist, album, minutes, seconds);
        root = insert(root, track);
        size++;
    }
    
    private Node insert(Node node, Track track) {
        if (node == null) {
            return new Node(track);
        } else if (track.getTitle().compareTo(node.track.getTitle()) < 0) {
            node.left = insert(node.left, track);
        } else {
            node.right = insert(node.right, track);
        }
        return node;
    }
    
    public void delete(String title) {
        root = delete(root, title);
        size--;
    }
    
    private Node delete(Node node, String title) {
        if (node == null) {
            return null;
        } else if (title.equals(node.track.getTitle())) {
            if (node.left == null && node.right == null) {
                return null;
            } else if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            } else {
                Node minNode = findMinNode(node.right);
                node.track = minNode.track;
                node.right = delete(node.right, minNode.track.getTitle());
                return node;
            }
        } else if (title.compareTo(node.track.getTitle()) < 0) {
            node.left = delete(node.left, title);
            return node;
        } else {
            node.right = delete(node.right, title);
            return node;
        }
    }
    
    private Node findMinNode(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
    
    public void displayInOrder() {
        displayInOrder(root);
    }
    
    private void displayInOrder(Node node) {
        if (node != null) {
            displayInOrder(node.left);
            System.out.println(node.track.toString());
            displayInOrder(node.right);
        }
    }
    
    public int height(Track track) {
        return height(root, track.getTitle(), 0);
    }
    
    private int heightHelper(Node node, String title) {
        if (node == null) {
            return -1;
        } else if (title.equals(node.track.getTitle())) {
            return node.height;
        } else if (title.compareTo(node.track.getTitle()) < 0) {
            return heightHelper(node.left, title);
        } else {
            return heightHelper(node.right, title);
        }
    } }
