##一 git核心区域

工作区  working director  就是工作写代码的地方
暂存区  staging area  就把代码提交到一个暂存的地方
本地仓库  local repository  就把在代码存入本地
远程仓库  remote repository  就把代码存入云端

##二 git操作

git clone <URL> 就将云上的代码下入本地电脑
git pull 拉取远程仓库的最新代码并合并到本地
git status 查看工作区的状态
git add <文件名> 将修改的文件存入暂存区
git commit -m "提交信息" 将暂存区的代码存入本地并附上说明
git branch 查看分支
git checkout -b <分支名> 创建分支并切换到该分支
git checkout <分支名> 切换到该分支
git log 查看提交记录
git push origin <分支名> 将本地代码推送到云端对应的分支