package com.masquerade.model.entity.characterSheet.skill;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CharacterHasSkillKey implements Serializable {
    @Column(name = "character_id")
    Long characterId;

    @Column(name = "skill_id")
    Long skillId;

    public CharacterHasSkillKey() {
    }

    public CharacterHasSkillKey(Long characterId, Long skillId) {
        this.characterId = characterId;
        this.skillId = skillId;
    }
}
