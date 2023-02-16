package leetcode.editor.en;

// P176_SecondHighestSalary

  public class P176_SecondHighestSalary {
      
      public static void main(String[] args) {

          //Solution solution = new P176_SecondHighestSalary().new Solution();

//          TOP (SQL Server), LIMIT (MySQL), ROWNUM (Oracle) 這些語法其實都是同樣的功能，
//          都是用來限制您的 SQL 查詢語句最多只影響幾筆資料，
//          而不同的語法則只因不同的資料庫實作時採用不同的名稱。

//          有些SQL的資料庫不支援[index,count]的格式(例如PostgreSQL)，必需要用OFFSET來取代，
//          OFFSET可以把它想成要略過筆數，以offset 2為例，便可想成在找到的資料筆數中略過前二筆，
//          即是由第三筆開始回傳

//mysql
//
//          select ifnull(
//          (select distinct salary
//          from Employee
//          ORDER BY salary DESC
//          limit 1 offset 1)
//          , null) as SecondHighestSalary
//
//  postgresql
//  mysql中的ifnull()函數對應postgresql的COALESCE
//          SELECT
//          COALESCE(
//                  (SELECT DISTINCT Salary
//                  FROM Employee
//                  ORDER BY Salary DESC
//                  LIMIT 1 OFFSET 1),
//                  NULL) AS SecondHighestSalary
//          }

          //There is no code of Java type for this problem
      }
  }