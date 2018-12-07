package org.ziyuzile.demo.dataStructure;

public class Main {
    public static void main(String[] args) {
        OrderedArrayList orderedArrayList = new OrderedArrayList(12);
        orderedArrayList.insert(12);
        orderedArrayList.insert(52);
        orderedArrayList.insert(32);
        orderedArrayList.insert(62);
        orderedArrayList.insert(82);
        orderedArrayList.insert(22);
        orderedArrayList.insert(22);
        orderedArrayList.insert(12);
        orderedArrayList.insert(52);
        orderedArrayList.insert(32);

        orderedArrayList.display();

        orderedArrayList.insert(33);

        orderedArrayList.display();

        orderedArrayList.delete(22);

        orderedArrayList.display();
    }
}
