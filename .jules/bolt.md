## 2026-03-29 - [Helio G85 Compatibility and Performance]
**Learning:** Hardcoding `VK_API_VERSION_1_2` breaks compatibility with Vulkan 1.1 drivers. Staging buffers, wait sync fences, and memory allocators present severe bottlenecks or crash conditions on MediaTek mobile drivers like the Helio G85.
**Action:** Audit and replace hardcoded Vulkan 1.2 versions to 1.1 across Vulkan initialization. Prioritize non-blocking operations and mobile-friendly staging allocations in future patches.

## 2026-03-30 - [Mali GPU TBDR RenderPass Load/Store Op Incompatibility]
**Learning:** Tile-Based Deferred Rendering (TBDR) GPUs like Mali on MediaTek Helio G85 discard tile memory if `VK_ATTACHMENT_LOAD_OP_DONT_CARE` is used, resulting in a blue/black screen or missing UI. Additionally, mismatching the depth and stencil `loadOp`/`storeOp` can cause driver confusion and validation crashes.
**Action:** When creating Vulkan render passes on mobile, always use `VK_ATTACHMENT_LOAD_OP_CLEAR` or `VK_ATTACHMENT_LOAD_OP_LOAD` for color/depth attachments that must not be discarded arbitrarily. Always mirror the `stencilLoadOp` to `depthLoadOp`.
