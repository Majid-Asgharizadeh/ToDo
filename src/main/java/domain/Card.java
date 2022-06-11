package domain;

import enums.State;

import javax.persistence.*;

@Entity
@Table(name = Card.TABLE_NAME)
public class Card {
    public static final String TABLE_NAME = "tbl_card";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;
    @Column(length = 500)
    private String content;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private State state;
    @ManyToOne
    private User user;

    public Card() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
