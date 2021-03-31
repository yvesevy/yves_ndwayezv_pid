package com.yvesnduwayezv.demo.model;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="artists")
public class Artist
{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String firstname;
    private String lastname;

    protected Artist() {}

    public Artist(String firstname, String lastname)
    {
        this.firstname = firstname;
        this.lastname = lastname;
    }

}
