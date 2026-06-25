INSERT INTO employee (id, name, department)
VALUES (1, 'John', 'IT')
ON CONFLICT (id) DO NOTHING;

INSERT INTO employee (id, name, department)
VALUES (2, 'Alice', 'HR')
ON CONFLICT (id) DO NOTHING;

INSERT INTO employee (id, name, department)
VALUES (3, 'Bob', 'Finance')
ON CONFLICT (id) DO NOTHING;

INSERT INTO employee (id, name, department)
VALUES (4, 'David', 'Sales')
ON CONFLICT (id) DO NOTHING;

INSERT INTO employee (id, name, department)
VALUES (5, 'Emma', 'Support')
ON CONFLICT (id) DO NOTHING;