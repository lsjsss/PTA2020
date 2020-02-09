## L1-3 敲笨钟
微博上有个自称“大笨钟V”的家伙，每天敲钟催促码农们爱惜身体早点睡觉。为了增加敲钟的趣味性，还会糟改几句古诗词。其糟改的方法为：去网上搜寻压“ong”韵的古诗词，把句尾的三个字换成“敲笨钟”。例如唐代诗人李贺有名句曰：“寻章摘句老雕虫，晓月当帘挂玉弓”，其中“虫”（chong）和“弓”（gong）都压了“ong”韵。于是这句诗就被糟改为“寻章摘句老雕虫，晓月当帘敲笨钟”。

现在给你一大堆古诗词句，要求你写个程序自动将压“ong”韵的句子糟改成“敲笨钟”。

## 输入格式：
输入首先在第一行给出一个不超过 20 的正整数 N。随后 N 行，每行用汉语拼音给出一句古诗词，分上下两半句，用逗号 `,` 分隔，句号 `.` 结尾。相邻两字的拼音之间用一个空格分隔。题目保证每个字的拼音不超过 6 个字符，每行字符的总长度不超过 100，并且下半句诗至少有 3 个字。

## 输出格式：
对每一行诗句，判断其是否压“ong”韵。即上下两句末尾的字都是“ong”结尾。如果是压此韵的，就按题面方法糟改之后输出，输出格式同输入；否则输出 `Skipped` ，即跳过此句。

## 输入样例：
>5  
xun zhang zhai ju lao diao chong, xiao yue dang lian gua yu gong.  
tian sheng wo cai bi you yong, qian jin san jin huan fu lai.  
xue zhui rou zhi leng wei rong, an xiao chen jing shu wei long.  
zuo ye xing chen zuo ye feng, hua lou xi pan gui tang dong.  
ren xian gui hua luo, ye jing chun shan kong.  

      
    
## 输出样例：
>xun zhang zhai ju lao diao chong, xiao yue dang lian qiao ben zhong.  
Skipped  
xue zhui rou zhi leng wei rong, an xiao chen jing qiao ben zhong.  
Skipped  
Skipped
