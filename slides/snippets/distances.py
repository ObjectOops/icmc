r_to_a = 65
r_to_u = 55
a_to_u = 40
u_to_a = 40
a_to_g = 180
u_to_g = 180

path_1 = r_to_a + a_to_g
path_2 = r_to_u + u_to_g
path_3 = r_to_a + a_to_u + u_to_g
path_4 = r_to_u + u_to_a + a_to_g

def is_path_valid(main_path, other_path_a, other_path_b, other_path_c):
    # This is the main boolean expression that return `True` if the path meets Dijkstra's criteria.
    return (
        (main_path <= other_path_a and main_path <= other_path_b and main_path <= other_path_c)
        or (main_path % 7 != 0 and main_path % 11 != 0)
    )
    # There can be multiple ways to write a boolean expression:
    # return (
    #     not (main_path > other_path_a or main_path > other_path_b or main_path > other_path_c)
    #     and not (main_path % 7 == 0 or main_path % 11 == 0)
    # )

path_1_valid = is_path_valid(path_1, path_2, path_3, path_4)
path_2_valid = is_path_valid(path_2, path_1, path_3, path_4)
path_3_valid = is_path_valid(path_3, path_1, path_2, path_4)
path_4_valid = is_path_valid(path_4, path_1, path_2, path_3)

print(f"Rotterdam --> Amsterdam --> Groningen: {path_1_valid}")
print(f"Rotterdam --> Utrecht --> Groningen: {path_2_valid}")
print(f"Rotterdam --> Amsterdam --> Utrecht --> Groningen: {path_3_valid}")
print(f"Rotterdam --> Utrecht --> Amsterdam --> Groningen: {path_4_valid}")
