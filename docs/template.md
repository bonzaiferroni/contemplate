find . -type f -exec sed -i \
-e 's/Contemplate/Project/g' \
-e 's/contemplate/project/g' \
-e 's/CONTEMPLATE/PROJECT/g' {} +