package main;

public class Player {
    private String name ;
    private String email;
    private int rank ;
    private  int age;
    private boolean white ;

    public Player(String name, String email, int rank, int age, boolean white) {
        if (name.isBlank() || email.isBlank() || email.contains("@") == false || email.contains(".") == false ) {
            throw new IllegalArgumentException("Некорректное значение") ;
        } else {
            this.name = name;
            this.email = email;
        }
        if (age <10  || age > 99 || rank < 100 || rank > 3000) {
            throw new IllegalArgumentException("Некорректное значение") ;
        } else {
            this.rank = rank;
            this.age = age;
        }
        this.white = white;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", rank=" + rank +
                ", age=" + age +
                ", white=" + white +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRank(int rank) {
        if  (rank < 100 || rank > 3000) {
            throw new IllegalArgumentException("Некорректный ранк") ;
        }
        this.rank = rank;
    }

    public void setAge(int age) {
        if (age <10  || age > 99) {
            throw new IllegalArgumentException("Некорректный возраст") ;
        }
        this.age = age;
    }

    public void setWhite(boolean white) {
        this.white = white;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getRank() {
        return rank;
    }

    public int getAge() {
        return age;
    }

    public boolean isWhite() {
        return white;
    }

    public void movePiece (Piece piece, Spot spot) {
        if (isWhite() != piece.isWhite()) {
            throw new IllegalArgumentException("Некорректный ход") ;
        }
        piece.setSpot(spot);
        System.out.println("Фигура " + piece.getName() + "делает ход " + spot );
    }


}
