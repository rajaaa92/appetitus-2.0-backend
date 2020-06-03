package com.appetitus.backend

import org.springframework.boot.ApplicationRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
open class BackendApplication {

	companion object {
		@JvmStatic fun main(args: Array<String>) {
			SpringApplication.run(BackendApplication::class.java, *args)
		}
	}

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
