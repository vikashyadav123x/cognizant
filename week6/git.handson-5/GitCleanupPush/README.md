# Git Hands-on 5

## Objectives

Explain how to clean up and push back to remote Git.

In this hands-on lab, you will learn how to:

- Execute steps involving clean up and push back to remote Git.

## Prerequisites

The following are the pre-requisites to complete this hands-on lab:

- Hands-on ID: `Git-T03-HOL_002`

Notes\*:

Please follow the below steps for creating a free account in GitHub.
Do not use cognizant credentials to login to GitHub.

Estimated time to complete this lab: 10 minutes.

Please follow the instructions to complete the hands-on. Each instruction expects a command for the Git Bash.

## Cleanup and Push Back:

1. Verify if master is in clean state.
2. List out all the available branches.
3. Pull the remote git repository to the master.
4. Push the changes, which are pending from `Git-T03-HOL_002` to the remote repository.
5. Observe if the changes are reflected in the remote repository.

## Steps Completed

1. Verified Git installation using `git --version`
2. Configured global username and email
3. Configured VS Code as the default Git editor
4. Created a local Git repository using `git init`
5. Created a sample file for the cleanup and push flow
6. Prepared the repository for committing and pushing changes

## Commands Used

```bash
git --version
git config --global user.name "Your Name"
git config --global user.email "your.email@example.com"
git config --global core.editor "code --wait"
git init
git branch -M main
git status
git branch
git remote add origin https://github.com/your-username/GitCleanupPush.git
git pull origin main
git add .
git commit -m "Initial commit"
git push -u origin main
```

## Result

The repository is prepared for cleaning up local changes and pushing the final state back to remote Git.

## GitCleanupPush was created as a separate repository and updated with cleanup and push flow:

```text
/home/vikash-yadav/cognizant/week6/git.handson-5/GitCleanupPush
```
