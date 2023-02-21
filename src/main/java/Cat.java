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

  /*  @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        if (getId() != cat.getId()) return false;
        return getName().equals(cat.getName());
    }

    @Override
    public int hashCode() {
        int result = (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + getName().hashCode();
        return result;
    }*/

