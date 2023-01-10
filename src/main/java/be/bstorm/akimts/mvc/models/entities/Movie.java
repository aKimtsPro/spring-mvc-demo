package be.bstorm.akimts.mvc.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Movie {

   @Id
   @Column(name = "movie_id", nullable = false)
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @Column(nullable = false)
   private String title;

   @Column(nullable = false)
   private int duration;

   @Column(nullable = false)
   private String country;

   @ElementCollection
   @JoinTable(
           name = "movie_directors",
           joinColumns = @JoinColumn(name = "movie_id")
   )
   private List<String> directors;

   @Enumerated(EnumType.STRING)
   @ElementCollection
   @JoinTable(
           name = "movie_genres",
           joinColumns = @JoinColumn(name = "movie_id")
   )
   private List<Genre> genres;

   @ManyToMany
   @JoinTable(
           name = "actor_gig",
           joinColumns = @JoinColumn(name = "movie_id"),
           inverseJoinColumns = @JoinColumn(name = "actor_id")
   )
   private List<Actor> actors;

}
