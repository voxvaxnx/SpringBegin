public class Cat {
    private String name;

    public Cat() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        return getName().equals(cat.getName());
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}*/