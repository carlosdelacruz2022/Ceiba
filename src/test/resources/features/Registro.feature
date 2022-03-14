#Proyecto de pruebas y cargado en Github
#13/03/2022
#Carlos De la cruz
Feature: Pruebas portal saucedemo --> ceiba
	@tag1
Scenario: Usuario Standart
	Given abrir el navegador
	When Login de usuario Standart
	Then Seleccionar producto Sauce Labs Fleece Jacket
	And Confirmar compra

	@tag2
	Scenario: Usuario locked
		Given abrir el navegador
		When Login de usuario locked

	@tag3
	Scenario: Usuario problem
		Given abrir el navegador
		When Login de usuario problem
		Then Seleccionar producto Sauce Labs Fleece Jacket
		And Confirmar compra

	@tag4
	Scenario: Usuario performance
		Given abrir el navegador
		When Login de usuario performance
		Then Seleccionar producto Sauce Labs Fleece Jacket
		And Confirmar compra

