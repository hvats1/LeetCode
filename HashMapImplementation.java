package com.company;

import java.util.ArrayList;

class CustHashMap<K, V> {

    private final double DEFAULT_LOAD_FACTOR = 0.75;
    int size;
    private int initialCapacity;
    private ArrayList<MapNode<K, V>> bucketList;

    public CustHashMap() {
        initialCapacity = 16;
        bucketList = new ArrayList<>(initialCapacity);
        for (int i = 0; i < initialCapacity; i++)
            bucketList.add(null);
    }


    public CustHashMap(int initialCapacity) {
        this.initialCapacity = initialCapacity;
        bucketList = new ArrayList<>(initialCapacity);
        for (int i = 0; i < initialCapacity; i++)
            bucketList.add(null);
    }
    public V get(K key) {
        return bucketList.get(getIndex(key)) == null ? null : bucketList.get(getIndex(key)).value;
    }

    public K put(K key, V value) {
        int index = getIndex(key);
        MapNode<K, V> temp = bucketList.get(index);

        while (temp != null) {
            if (temp.key == key) {
                temp.value = value;
                return key;
            }
            temp = temp.next;
        }
        temp = bucketList.get(index);

        if (isLoadFactorExceed())
            rehash();

        MapNode<K, V> newElementNode = new MapNode<>(key, value);
        newElementNode.key=key;
        newElementNode.value=value;
        newElementNode.next = temp;
        bucketList.set(index,newElementNode);
        size++;
        return key;

    }

    private void rehash() {
        ArrayList<MapNode<K, V>> tempList = bucketList;
        initialCapacity *= 2;
        size = 0;
        bucketList = new ArrayList<MapNode<K, V>>(initialCapacity);

        for (int i = 0; i < initialCapacity; i++)
            bucketList.add(null);


        tempList.stream().forEach(tempMapNode ->
        {
            while (tempMapNode != null) {
                put(tempMapNode.key, tempMapNode.value);
                tempMapNode = tempMapNode.next;
            }
            size++;
        });


    }

    private boolean isLoadFactorExceed() {
        double currentloadFactor = (float) size / (float) initialCapacity;
        return currentloadFactor >= DEFAULT_LOAD_FACTOR;
    }

    private int getIndex(K key) {
        return key.hashCode() % initialCapacity;
    }

   private class MapNode<K, V> {

        K key;
        V value;
        MapNode next;

        public MapNode(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }

        @Override
        public String toString() {
            return "Key :: ".concat(key.toString()).concat(" Value :: ").concat(value.toString());
        }

    }
}


public class HashMapImplementation {
    public static void main(String[] args) {
        CustHashMap<String, String> map = new CustHashMap<>(16);
        map.put("FB","1");
        map.put("Ea","2");
        map.put("3","3");
        map.put("4","4");
        map.put("5","5");
        System.out.println(map.get("3"));

    }
}
