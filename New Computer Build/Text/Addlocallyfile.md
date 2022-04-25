# 将本地文件夹上传到Github远程存储库

***

将本地文件夹push到Github存储库中：
打开Git Bash，将当前目录修改为需要上传的文件夹
初始化本地Git文件夹:
`git init`
`git add .`
首次提交：`git commit -m "First commit"`
将Github存储库的完整网址复制：
![ ](./../Picture/屏幕截图%202022-04-25%20111725.png "屏幕截图")
`git remote add origin 存储库地址`
> 这里若报错：
> `fatal: remote origin already exists.`
> 则使用：
> `git remote rm origin`
> 再使用：
> `git remote add origin 存储库地址`

验证我们添加的存储库：
`git remote -v`
最后使用Push上传即可：
`git push origin master`
得到输出为：

``` 
Enter passphrase for key '*******':
Enumerating objects: 76, done.
Counting objects: 100% (76/76), done.
Delta compression using up to 4 threads
Compressing objects: 100% (63/63), done.
Writing objects: 100% (76/76), 23.29 KiB | 390.00 KiB/s, done.
Total 76 (delta 26), reused 0 (delta 0)
remote: Resolving deltas: 100% (26/26), done.
To github.com:FightingAlwaysOnline/NDATAFLUSH.git
 * [new branch]      master -> mastter
 ```
