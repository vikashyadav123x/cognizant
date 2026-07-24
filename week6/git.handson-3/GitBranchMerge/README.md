# Git Hands-on 3

## Objectives

Explain branching and merging.

Explain about creating a branch request in GitLab.

Explain about creating a merge request in GitLab.

In this hands-on lab, you will learn how to:

- Construct a branch, do some changes in the branch, and merge it with master (or trunk)

## Prerequisites

The following are the pre-requisites to complete this hands-on lab:

- Setting up Git environment with P4Merge tool for Windows

Notes\*:

Please follow the below steps for creating a free account in GitHub.
Do not use cognizant credentials to login to GitHub.

Estimated time to complete this lab: 30 minutes.

Please follow the instruction to complete the hands-on. Each instruction expects a command for the Git Bash.

## Branching:

1. Create a new branch `GitNewBranch`.
2. List all the local and remote branches available in the current trunk. Observe the `*` mark which denote the current pointing branch.
3. Switch to the newly created branch. Add some files to it with some contents.
4. Commit the changes to the branch.
5. Check the status with `git status` command.

## Merging:

1. Switch to the master
2. List out all the differences between trunk and branch. These provide the differences in command line interface.
3. List out all the visual differences between master and branch using P4Merge tool.
4. Merge the source branch to the trunk.
5. Observe the logging after merging using `git log --oneline --graph --decorate`
6. Delete the branch after merging with the trunk and observe the git status.

## Steps Completed

1. Verified Git installation using `git --version`
2. Configured global username and email
3. Configured VS Code as the default Git editor
4. Created a local Git repository using `git init`
5. Created an initial file on the main branch
6. Created the `GitNewBranch` branch and added changes to it
7. Merged the branch back to the main branch
8. Deleted the feature branch after merge

## Commands Used

```bash
git --version
git config --global user.name "Your Name"
git config --global user.email "your.email@example.com"
git config --global core.editor "code --wait"
git init
git branch -M main
echo "Welcome to GitBranchMerge" > welcome.txt
git add welcome.txt
git commit -m "Initial commit"
git branch GitNewBranch
git switch GitNewBranch
echo "This file was added on GitNewBranch." > branch-note.txt
git add branch-note.txt
git commit -m "Add branch note"
git switch main
git merge GitNewBranch
git log --oneline --graph --decorate
git branch -d GitNewBranch
```

## Result

The repository demonstrates branching, merging, and branch deletion after merge.

## GitBranchMerge was created as a separate repository and updated with branch and merge flow:

```text
/home/vikash-yadav/cognizant/week6/git.handson-3/GitBranchMerge
```
