<?php

fscanf(STDIN, "%d", $N);
for ($i = 0; $i < $N; $i++)
{
    fscanf(STDIN, "%d", $pi);
    $pis[] = $pi;
}

sort($pis);

for ($i = 1; $i < $N; $i++)
{
    $diff[] = $pis[$i] - $pis[$i-1];
}

echo min($diff) . "\n";

?>