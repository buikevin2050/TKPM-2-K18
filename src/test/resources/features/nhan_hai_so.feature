#feature: từ khóa
Feature: tính tích 2 số
#mô tả ngắn gọn cho tính năng này
Như là một người dui tính, mê số, lười vận động nơ ron thần kinh
Tôi muốn biết kết quả của tích 2 số bằng phần mềm
Để tôi khỏi phải tốn thời gian công sức

#mô tả giá trị kinh doanh (business value) tính năng bằng các kịch bản
Scenario Outline: tính tích 2 số hợp lệ
Given tèo có 2 số <num1> và <num2>
When tèo thực hiện nhân 2 số
Then tèo được thông báo là <result> <color>
And kết quả được lưu lại <store>


Examples:

| num1 | num2 | result | store  | color | reason |
| 2    | 3    | 6      | true   | green | even   |
| 4    | 5    | 20     | true   | green | even   |
| 7    | 3    | 21     | true   | red   | odd    |
