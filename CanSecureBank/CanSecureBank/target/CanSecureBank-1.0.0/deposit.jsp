<!DOCTYPE html>
<html>
<head><title>Deposit</title></head>
<body>
    <h2>Deposit Funds</h2>
    <form action="bank" method="post">
        <input type="hidden" name="action" value="deposit"/>
        Amount: <input type="number" name="amount" step="0.01" required/>
        <button type="submit">Deposit</button>
    </form>
</body>
</html>