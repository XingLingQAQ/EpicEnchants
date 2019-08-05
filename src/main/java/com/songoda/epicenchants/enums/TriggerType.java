package com.songoda.epicenchants.enums;

public enum TriggerType {
    ATTACK_PLAYER_MELEE,
    ATTACK_PLAYER_RANGE,

    DEFENSE_PLAYER_MELEE,
    DEFENSE_PLAYER_RANGE,

    ATTACK_MOB_MELEE,
    ATTACK_MOB_RANGE,

    DEFENSE_MOB_MELEE,
    DEFENSE_MOB_RANGE,

    DEATH,
    KILLED_PLAYER,
    KILLED_MOB,

    EXPLOSION_DAMAGE,
    FALL_DAMAGE,
    FIRE_DAMAGE,
    POISON_DAMAGE,

    HELD_ITEM,
    STATIC_EFFECT,

    BLOCK_BREAK,
    EXPERIENCE_BLOCK_BREAK,

    RIGHT_CLICK_BLOCK,
    LEFT_CLICK_BLOCK,
    REPEATING, //TODO: Figure out what this is.
    RIGHT_CLICK,
    LEFT_CLICK
}
