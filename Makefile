SBT := ./sbt
TEST_NAME := TestGettingStarted

watch:
	$(SBT) "~ test"

watch-only:
	$(SBT) "~ testOnly $(TEST_NAME)"
