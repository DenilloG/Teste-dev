package com.service

import com.models.City
import com.models.State
import javax.enterprise.context.ApplicationScoped


@ApplicationScoped
class StateService {
    private var states = ArrayList<State>();

    public fun getAll(): List<State> {
        return states;
    }

    fun addState(state: State) {
        states.add(state);
    }

    fun removeState(id: Int) {
        states.removeIf { x -> x.id == id };
    }

}