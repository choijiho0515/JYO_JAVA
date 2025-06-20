package org.example;

public class Main {
    public static void main(String[] args) {
        Block genesisBlock = new Block("백엔드는 영원하다!", "");

        genesisBlock.mineBlock(8);
    }
}