package model.infrastucture;

public class Department{
    private long id;
    private String name;
    private String address;
    private int MaxCapacity;
    public Department(long id,String name,String address,int maxCapacity){
        this.id=id;
        this.name=name;
        this.address=address;
        this.MaxCapacity=maxCapacity;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getMaxCapacity() {
        return MaxCapacity;
    }
}

