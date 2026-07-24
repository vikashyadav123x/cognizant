# Git Hands-on 2

## Objectives

Explain git ignore.

Explain how to ignore unwanted files using git ignore.

In this hands-on lab, you will learn how to:

- Implement git ignore command to ignore unwanted files and folders

## Prerequisites

The following are the pre-requisites to complete this hands-on lab:

- Setting up Git environment
- Integrate notepad++ as a default editor
- A Git repository in the local system and a remote repository in GitLab

Notes\*:

Please follow the below steps for creating a free account in GitHub.
Do not use cognizant credentials to login to GitHub.

Estimated time to complete this lab: 20 minutes.

Create a ".log" file and a log folder in the working directory of Git. Update the .gitignore file in such a way that on committing, these files (.log extensions and log folders) are ignored.

Verify if the git status reflects the same about working directory, local repository and git repository.

## Steps Completed

1. Verified Git installation using `git --version`
2. Configured global username and email
3. Configured VS Code as the default Git editor
4. Created a local Git repository using `git init`
5. Created a `.log` file and a `log` folder
6. Added ignore rules for `.log` files and the `log` folder using `.gitignore`
7. Verified the ignored files do not appear in `git status`
8. Prepared the repository for commit and push

## Commands Used

```bash
git --version
git config --global user.name "Your Name"
git config --global user.email "your.email@example.com"
git config --global core.editor "code --wait"
git init
echo "Application started successfully" > server.log
mkdir log
echo "This folder should be ignored by Git." > log/readme.txt
git status
printf "*.log\nlog/\n" > .gitignore
git status
git add .gitignore
```

## Result

The unwanted `.log` files and `log` folder are ignored by Git, while the repository remains ready for normal commits.

## GitDemoIgnore was created as a separate repository and updated with ignore rules:

```text
/home/vikash-yadav/cognizant/week6/git.handson-2/GitDemoIgnore
```
