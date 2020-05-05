package com.example.lab11.repo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "players", schema = "game")
public class PlayersEntity {
    private int playerId;
    private String lastName;
    private String firstName;
    private Integer wins;
    private Integer losses;

    @Id
    @Column(name = "player_id")
    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    @Basic
    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "wins")
    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    @Basic
    @Column(name = "losses")
    public Integer getLosses() {
        return losses;
    }

    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayersEntity that = (PlayersEntity) o;
        return playerId == that.playerId &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(wins, that.wins) &&
                Objects.equals(losses, that.losses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerId, lastName, firstName, wins, losses);
    }

    public void set(String name1, String name2) {
        this.firstName = name1;
        this.lastName = name2;
    }
}
