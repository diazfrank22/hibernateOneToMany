package hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "PostComment")
@Table(name = "post_comment")
public class PostComment {
 
    @Id
    @GeneratedValue
    private Long id;
 
    private String review;
    /** Bidirectional @OneToMany */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id3")
    private Post post;
 
    //Constructors, getters and setters removed for brevity
}
