package org.springframework.samples.petclinic.feeding;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.ManyToAny;
import org.springframework.samples.petclinic.model.BaseEntity;
import org.springframework.samples.petclinic.pet.PetType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FeedingType extends BaseEntity{

    @NotEmpty
    @Size(min=3,max=50)
    @Column(unique = true)
    String name;
    @NotEmpty
    String description;
    @ManyToOne
    @NotNull
    @Column(name="pet_type_id")
    PetType petType;
}
