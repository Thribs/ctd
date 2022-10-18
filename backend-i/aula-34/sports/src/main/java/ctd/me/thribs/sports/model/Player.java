package ctd.me.thribs.sports.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "players")
public class Player {

    @Id
    @SequenceGenerator(name = "player_sequence", sequenceName = "player_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "player_sequence")
    private Long id;
    private String name;
    private String favoriteTeam;

    @ManyToOne
    
}
