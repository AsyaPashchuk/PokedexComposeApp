package com.pokedexcomposeapp.pokemon_detail

import androidx.lifecycle.ViewModel
import com.pokedexcomposeapp.data.remote.responses.Pokemon
import com.pokedexcomposeapp.repository.PokemonRepository
import com.pokedexcomposeapp.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) :ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}