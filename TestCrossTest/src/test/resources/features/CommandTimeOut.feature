@Unit
Feature: Test the command timeout setting

	Scenario: Test the command timeout
		When I execute the following query on source:
			"""
			WAITFOR DELAY '00:00:05'
			SELECT *
			FROM [Source].[CUST_HUB]

			"""