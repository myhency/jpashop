package jpabook.jpashop.domain.item;

import jpabook.jpashop.domain.Item;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Getter
@Setter
@DiscriminatorValue("M")
public class Movie extends Item {

    private String director;
    private String actor;
}
