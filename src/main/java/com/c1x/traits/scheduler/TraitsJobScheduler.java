package com.c1x.traits.scheduler;

import com.c1x.traits.entity.ComputedTrait;
import com.c1x.traits.entity.Trait;
import com.c1x.traits.repository.ComputedTraitRepository;
import com.c1x.traits.repository.TraitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TraitsJobScheduler {

    @Autowired
    ComputedTraitRepository computedTraitRepository;

    @Autowired
    TraitRepository traitRepository;

    @Scheduled(fixedDelayString = "PT20.345S")
    public void scheduleTraitsJob() {

        System.out.printf("In the Scheduler.....");
        System.out.println("Getting values of Traits and Its Computed Traits");
        traitRepository.findAll().forEach(x -> {
            System.out.println("ID                  : " + x.getId());
            System.out.println("Account Id          : " +x.getAccountId());
            System.out.println("Trait Type          : " +x.getTraitType());
            System.out.println("Trait Value Type    : " +x.getTraitValueType());
            System.out.println("Trait Status        : " +x.getStatus());
            if(x.getComputedTrait() != null)
                System.out.println("Trait Definition \n : " +x.getComputedTrait().getDefinition());
            else
                System.out.println("Traits Definition is Null");
            System.out.println("\n");
        });
       /*
       computedTraitRepository.findAll().forEach(x -> {
            System.out.println("Iterating Records..");
            System.out.println(x.getDefinition());
        });

        */
    }
}
