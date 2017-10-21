# 一级标题
## 二级标题
### 三级标题
#### 四级标题

#### 无序列表
- 列表1
    - 列表1.1
    - 列表1.2
- 列表2
- 列表3

#### 有序列表
1. 列表1
    1. 列表1.1
    2. 列表1.2
- 列表2
- 列表3

date 2017/10/21 
一 将数据存储到文件中
1. MODE_PRIVATE 同样文件名覆盖
2. MODE_APPEND 文件存在追加
``` java
    out = openFileOutput("data",Context.MODE_PRIVATE);
    writer = new BufferedWriter(new OutputStreamWriter(out));
