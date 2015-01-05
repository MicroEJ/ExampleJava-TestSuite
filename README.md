# Overview

This project is a Java Test Suite example for MicroEJ. The MicroEJ Test-Suite is an engine made for validating any development project using automatic testing. The MicroEJ Test-Suite engine allow the user to test any kind of projects within the configuration of a generic ant file.

The test suite output is created in a /results folder in xml and html format.

The MicroEJ test suite documentation can be found in the MicroEJ Platform Architecture User Manual in section Developments Tools -> Test Suite. This document can be viewed in MicroEJ Resource center view -> Manual.


## Project Setup

- Import the JavaTestSuite project in a MicroEJ workspace.
- This project comes with a default MicroEJ launchers (.launch) for the STM32F429IDISCO kickstart Java Platform. This can be changed in Run->run configuration->MicroEJ Application->Test 1: Execution -> Target JPF.
- Run->run configuration: MicroEJ Application->Test 1: click on Run
- Right click on the testsuite/javaTestsuite.xml->Run as-> Ant Build

### Requirements

- JRE 7(or later) x86
- MicroEJ 3.1 or later

### Project structure

- `src/`
  - Java sources
- `launch/`: MicroEJ launches
- testsuite/: the harness and Java test suite configuration
- `LICENCE.md`
- `README.md`


## Usage

Follow the instructions described in the MicroEJ Platform Architecture User Manual in section Developments Tools -> Test Suite.

## Changes

- Dec 2014: initial release

## License

See the license file `LICENSE.md` located at the root of this repository.
