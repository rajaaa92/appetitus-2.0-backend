package com.appetitus.backend

import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class BackendApplication {
	@Bean
	fun run(repository: RecipeRepository) = ApplicationRunner {
		repository.save(RecipeModel(
				name = "Jabłoniec",
				instructions = "Zapytaj babcię jak sie go robi :)"
		))
		repository.save(RecipeModel(
				name = "Kawa",
				instructions = "Włącz ekspres, włóż kawę, wlej wodę i wciśnij przycisk."
		))
	}
}

fun main(args: Array<String>) {
	runApplication<BackendApplication>(*args)
}