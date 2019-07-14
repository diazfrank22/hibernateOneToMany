package hibernate.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "Post")
@Table(name = "post")
public class Post {
 
    @Id
    @GeneratedValue
    private Long id;
 
    private String title;
    
    /** Unidirectional @OneToMany */
    @OneToMany(
        cascade = CascadeType.ALL,
        orphanRemoval = true
    )
    private List<PostComment> comments;
    
    /** Unidirectional @OneToMany with @JoinColumn */
    @OneToMany(
    		cascade = CascadeType.ALL,
            orphanRemoval = true)
    @JoinColumn(name = "post_id1")
    private List<PostComment> comments1;
    
    /** Bidirectional @OneToMany */
    @OneToMany(
            mappedBy = "post",
            cascade = CascadeType.ALL,
            orphanRemoval = true
        )
        private List<PostComment> comments3;
 
    //Constructors, getters and setters removed for brevity
}