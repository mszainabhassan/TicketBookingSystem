UPDATE users
SET is_active=true
WHERE is_active IS NULL;