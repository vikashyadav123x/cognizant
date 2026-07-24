# Git Hands-on 4

## Objectives

Explain how to resolve the conflict during merge.

In this hands-on lab, you will learn how to:

- Implement conflict resolution when multiple users are updating the trunk (or master) in such a way that it results into a conflict with the branch's modification.

## Prerequisites

The following are the pre-requisites to complete this hands-on lab:

- Hands-on ID: `Git-T03-HOL_001`

Notes\*:

Please follow the below steps for creating a free account in GitHub.
Do not use cognizant credentials to login to GitHub.

Estimated time to complete this lab: 30 minutes.

Please follow the instructions to complete the hands-on. Each instruction expects a command for the Git Bash.

## Conflict Resolution:

1. Verify if master is in clean state.
2. Create a branch `GitWork`. Add a file `hello.xml`.
3. Update the content of `hello.xml` and observe the status.
4. Commit the changes to reflect in the branch.
5. Switch to master.
6. Add a file `hello.xml` to the master and add some different content than previous.
7. Commit the changes to the master.
8. Observe the log by executing `git log --oneline --graph --decorate --all`.
9. Check the differences with Git diff tool.
10. For better visualization, use P4Merge tool to list out all the differences between master and branch.
11. Merge the branch to the master.
12. Observe the git mark up.
13. Use 3-way merge tool to resolve the conflict.
14. Commit the changes to the master, once done with conflict.
15. Observe the git status and add backup file to the `.gitignore` file.
16. Commit the changes to the `.gitignore`.
17. List out all the available branches.
18. Delete the branch, which merged to master.
19. Observe the log by executing `git log --oneline --graph --decorate`.

## Steps Completed

1. Verified Git installation using `git --version`
2. Configured global username and email
3. Configured VS Code as the default Git editor
4. Created a local Git repository using `git init`
5. Created `hello.xml` on the branch and on master with conflicting content
6. Merged the branch into master and resolved the conflict
7. Added a backup file rule to `.gitignore`
8. Deleted the merged branch after completion

## Commands Used

```bash
git --version
git config --global user.name "Your Name"
git config --global user.email "your.email@example.com"
git config --global core.editor "code --wait"
git init
git branch -M main
git status
git branch GitWork
git switch GitWork
cat > hello.xml <<'EOF'
<branch>
  <message>Hello from GitWork branch</message>
</branch>
EOF
git add hello.xml
git commit -m "Add hello xml on branch"
git switch main
cat > hello.xml <<'EOF'
<master>
  <message>Hello from master</message>
</master>
EOF
git add hello.xml
git commit -m "Add hello xml on master"
git log --oneline --graph --decorate --all
git diff main GitWork
git merge GitWork
# resolve the conflict in hello.xml
cat > hello.xml <<'EOF'
<merged>
  <message>Hello from master and GitWork branch</message>
</merged>
EOF
git add hello.xml
git commit -m "Resolve merge conflict"
echo "backup file" > hello.xml.bak
echo "*.bak" >> .gitignore
git add .gitignore
git commit -m "Ignore backup files"
git branch -d GitWork
git log --oneline --graph --decorate
```

## Result

The repository demonstrates a merge conflict and its resolution, including cleanup after the branch is merged.

## GitConflictMerge was created as a separate repository and updated with conflict resolution flow:

```text
/home/vikash-yadav/cognizant/week6/git.handson-4/GitConflictMerge
```
