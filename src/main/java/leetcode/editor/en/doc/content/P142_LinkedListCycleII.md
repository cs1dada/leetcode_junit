<p>Given the <code>head</code> of a linked list, return <em>the node where the cycle begins. If there is no cycle, return </em><code>null</code>.</p>

<p>There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the <code>next</code> pointer. Internally, <code>pos</code> is used to denote the index of the node that tail&#39;s <code>next</code> pointer is connected to (<strong>0-indexed</strong>). It is <code>-1</code> if there is no cycle. <strong>Note that</strong> <code>pos</code> <strong>is not passed as a parameter</strong>.</p>

<p><strong>Do not modify</strong> the linked list.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist.png" style="height: 145px; width: 450px;" />
<pre>
<strong>Input:</strong> head = [3,2,0,-4], pos = 1
<strong>Output:</strong> tail connects to node index 1
<strong>Explanation:</strong> There is a cycle in the linked list, where tail connects to the second node.
</pre>

<p><strong>Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist_test2.png" style="height: 105px; width: 201px;" />
<pre>
<strong>Input:</strong> head = [1,2], pos = 0
<strong>Output:</strong> tail connects to node index 0
<strong>Explanation:</strong> There is a cycle in the linked list, where tail connects to the first node.
</pre>

<p><strong>Example 3:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist_test3.png" style="height: 65px; width: 65px;" />
<pre>
<strong>Input:</strong> head = [1], pos = -1
<strong>Output:</strong> no cycle
<strong>Explanation:</strong> There is no cycle in the linked list.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of the nodes in the list is in the range <code>[0, 10<sup>4</sup>]</code>.</li>
	<li><code>-10<sup>5</sup> &lt;= Node.val &lt;= 10<sup>5</sup></code></li>
	<li><code>pos</code> is <code>-1</code> or a <strong>valid index</strong> in the linked-list.</li>
</ul>

<p>&nbsp;</p>
<p><strong>Follow up:</strong> Can you solve it using <code>O(1)</code> (i.e. constant) memory?</p>
<div><div>Related Topics</div><div><li>Hash Table</li><li>Linked List</li><li>Two Pointers</li></div></div><br><div><li>👍 7081</li><li>👎 463</li></div>

<div id="labuladong"><hr>

**通知：[数据结构精品课](https://aep.h5.xeknow.com/s/1XJHEO) 已更新到 V2.1，[手把手刷二叉树系列课程](https://aep.xet.tech/s/3YGcq3) 上线。**



<p><strong><a href="https://labuladong.github.io/article?qno=142" target="_blank">⭐️labuladong 题解</a></strong></p>
<details><summary><strong>labuladong 思路</strong></summary>

## 基本思路

> 本文有视频版：[链表双指针技巧全面汇总](https://www.bilibili.com/video/BV1q94y1X7vy)

基于 [141. 环形链表](/problems/linked-list-cycle) 的解法，直观地来说就是当快慢指针相遇时，让其中任一个指针指向头节点，然后让它俩以相同速度前进，再次相遇时所在的节点位置就是环开始的位置。

原理也简单说下吧，我们假设快慢指针相遇时，慢指针 `slow` 走了 `k` 步，那么快指针 `fast` 一定走了 `2k` 步：

![](https://labuladong.gitee.io/pictures/双指针/3.jpeg)

`fast` 一定比 `slow` 多走了 `k` 步，这多走的 `k` 步其实就是 `fast` 指针在环里转圈圈，所以 `k` 的值就是环长度的「整数倍」。

假设相遇点距环的起点的距离为 `m`，那么结合上图的 `slow` 指针，环的起点距头结点 `head` 的距离为 `k - m`，也就是说如果从 `head` 前进 `k - m` 步就能到达环起点。

巧的是，如果从相遇点继续前进 `k - m` 步，也恰好到达环起点：

![](https://labuladong.gitee.io/pictures/双指针/2.jpeg)

所以，只要我们把快慢指针中的任一个重新指向 `head`，然后两个指针同速前进，`k - m` 步后一定会相遇，相遇之处就是环的起点了。

**详细题解：[双指针技巧秒杀七道链表题目](https://labuladong.github.io/article/fname.html?fname=链表技巧)**

**标签：[数据结构](https://mp.weixin.qq.com/mp/appmsgalbum?__biz=MzAxODQxMDM0Mw==&action=getalbum&album_id=1318892385270808576)，[链表](https://mp.weixin.qq.com/mp/appmsgalbum?__biz=MzAxODQxMDM0Mw==&action=getalbum&album_id=2120596033251475465)，[链表双指针](https://mp.weixin.qq.com/mp/appmsgalbum?__biz=MzAxODQxMDM0Mw==&action=getalbum&album_id=2120596033251475465)**

## 解法代码

```java
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast, slow;
        fast = slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) break;/**<extend down -200>

![](https://labuladong.gitee.io/pictures/双指针/3.jpeg)
*/
        }
        // 上面的代码类似 hasCycle 函数
        if (fast == null || fast.next == null) {
            // fast 遇到空指针说明没有环
            return null;
        }

        // 重新指向头结点
        slow = head;/**<extend up -100>

![](https://labuladong.gitee.io/pictures/双指针/2.jpeg)
*/
        // 快慢指针同步前进，相交点就是环起点
        while (slow != fast) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
```

**类似题目**：
  - [141. 环形链表 🟢](/problems/linked-list-cycle)
  - [160. 相交链表 🟢](/problems/intersection-of-two-linked-lists)
  - [19. 删除链表的倒数第 N 个结点 🟠](/problems/remove-nth-node-from-end-of-list)
  - [21. 合并两个有序链表 🟢](/problems/merge-two-sorted-lists)
  - [23. 合并K个升序链表 🔴](/problems/merge-k-sorted-lists)
  - [86. 分隔链表 🟠](/problems/partition-list)
  - [876. 链表的中间结点 🟢](/problems/middle-of-the-linked-list)
  - [剑指 Offer 22. 链表中倒数第k个节点 🟢](/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof)
  - [剑指 Offer 25. 合并两个排序的链表 🟢](/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof)
  - [剑指 Offer 52. 两个链表的第一个公共节点 🟢](/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof)
  - [剑指 Offer II 021. 删除链表的倒数第 n 个结点 🟠](/problems/SLwz0R)
  - [剑指 Offer II 022. 链表中环的入口节点 🟠](/problems/c32eOV)
  - [剑指 Offer II 023. 两个链表的第一个重合节点 🟢](/problems/3u1WK4)
  - [剑指 Offer II 078. 合并排序链表 🔴](/problems/vvXgSW)

</details>
</div>



