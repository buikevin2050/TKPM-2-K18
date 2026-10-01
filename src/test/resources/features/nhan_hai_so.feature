Feature: Tính tích hai số, kiểm định chủ đề màu sắc giao diện và lưu trữ kết quả.

	Scenario Outline: Tính tích hai số cơ bản (gồm số dương, số âm, số 0)
		Given Tôi có hai số <num1> và <num2>
		When Tôi thực hiện phép nhân
		Then Kết quả là <result>

		Examples:
			| num1 | num2 | result |
			| 2    | 3    | 6      |
			| -4   | 5    | -20    |
			| 7    | -3   | -21    |
			| 0    | -8   | 0      |

	Scenario Outline: Xác định màu nền giao diện và màu chữ kết quả dựa trên tính chẵn lẻ của hai số đầu vào và tích số
		Given Tôi có hai số <num1> và <num2>
		When Tôi thực hiện phép nhân
		Then Màu nền là "<background>" và màu chữ là "<textColor>"

		Examples:
			| num1 | num2 | background | textColor |
			| 2    | 4    | Hồng       | Xanh lá   |
			| 2    | 3    | Xanh dương | Xanh lá   |
			| 3    | 5    | Đỏ         | Đỏ        |
			| 3    | 4    | Vàng       | Xanh lá   |

	Scenario: Kiểm định lưu trữ kết quả vào bộ nhớ (IOMemory / Saving)
		Given Tôi có hai số 6 và 7
		When Tôi thực hiện phép nhân
		Then Kết quả 42 đã được lưu trong bộ nhớ