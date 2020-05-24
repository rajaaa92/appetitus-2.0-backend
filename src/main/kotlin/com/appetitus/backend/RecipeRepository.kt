package com.appetitus.backend

import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "recipes", path = "recipes")
interface RecipeRepository : CrudRepository <RecipeModel, Long > {}