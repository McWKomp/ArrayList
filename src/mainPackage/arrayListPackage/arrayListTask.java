package mainPackage.arrayListPackage;

public class arrayListTask {
    public static void main(String[] args) {

        ArrayListRemake arrayList = new ArrayListRemake();

        arrayList.add("1String");
        arrayList.add("2String");
        arrayList.add("3String");
        arrayList.add("4String");
        arrayList.add("5String");

        arrayList.print();

        arrayList.add(2, "add String");

        arrayList.print();

        arrayList.set(0, "set Str");

        System.out.println(arrayList.get(1));

        arrayList.print();

        arrayList.remove(4);

        arrayList.print();
    }
}

class ArrayListRemake{
    private String[] arrayList = new String[3];
    private int size = 0;

    public void add(String str) {
        if (arrayList.length == size) {

            String[] tmp = new String[size * 2];
            for (int i = 0; i < size; i++) {
                tmp[i] = arrayList[i];
            }
            arrayList= tmp;
        }
        System.out.println("Item "+'"'+str+'"'+" has been added");
        arrayList[size] = str;
        size++;
    }

    public void add(int index, String str){
        if (arrayList.length == size) {
            String[] tmp = new String[size * 2];
            for (int i = 0; i < size; i++) {
                tmp[i] = arrayList[i];
            }
            arrayList= tmp;
        }
        System.out.println("Item "+'"'+str+'"'+" has been added to index "+index);
        for (int i = size-1; i >= index; i--) {
            arrayList[i+1] = arrayList[i];
        }
        arrayList[index] = str;
        ++size;
    }

    public boolean remove(int index) {
        if (index <= size) {
            System.out.println("Item "+'"'+arrayList[index]+'"'+" has been deleted");
            for (int i = 0; i < size; i++) {
                if (i == index) {
                    arrayList[i] = arrayList[i+1];
                }
            }
            --size;
            return true;
        }else{
            System.out.println("There is no such index");
            return false;
        }
    }

    public String get(int index) {
        return arrayList[index];
    }

    public void set(int index, String str){
        System.out.println("String "+'"'+str+'"'+ " has been set on index "+index);
        arrayList[index] = str;
    }

    public void print() {
        if (size>0){
            System.out.println("List of items in array: ");
            for (int i = 0; i < size; i++) {
                System.out.println(" - "+arrayList[i]);
            }
        } else{
            System.out.println("There is no items in array to print");
        }

    }
}
