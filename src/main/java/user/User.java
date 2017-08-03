package user;

public class User {

    private String surname;
    private int yearOfBirthday;
    private String email;

    public User() {

    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYearOfBirthday() {
        return yearOfBirthday;
    }

    public void setYearOfBirthday(int yearOfBirthday) {
        this.yearOfBirthday = yearOfBirthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (yearOfBirthday != user.yearOfBirthday) return false;
        if (!surname.equals(user.surname)) return false;
        return email.equals(user.email);
    }

    @Override
    public int hashCode() {
        int result = surname.hashCode();
        result = 31 * result + yearOfBirthday;
        result = 31 * result + email.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "surname='" + surname + '\'' +
                ", yearOfBirthday=" + yearOfBirthday +
                ", email='" + email + '\'' +
                '}';
    }
}
