<?php

// This file has been auto-generated by the Symfony Dependency Injection Component for internal use.

if (\class_exists(\ContainerY88tpjq\appDevDebugProjectContainer::class, false)) {
    // no-op
} elseif (!include __DIR__.'/ContainerY88tpjq/appDevDebugProjectContainer.php') {
    touch(__DIR__.'/ContainerY88tpjq.legacy');

    return;
}

if (!\class_exists(appDevDebugProjectContainer::class, false)) {
    \class_alias(\ContainerY88tpjq\appDevDebugProjectContainer::class, appDevDebugProjectContainer::class, false);
}

return new \ContainerY88tpjq\appDevDebugProjectContainer([
    'container.build_hash' => 'Y88tpjq',
    'container.build_id' => '140f44b8',
    'container.build_time' => 1582583152,
], __DIR__.\DIRECTORY_SEPARATOR.'ContainerY88tpjq');