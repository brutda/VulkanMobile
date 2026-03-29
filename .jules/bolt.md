## 2026-03-29 - [Helio G85 Compatibility and Performance]
**Learning:** Hardcoding `VK_API_VERSION_1_2` breaks compatibility with Vulkan 1.1 drivers. Staging buffers, wait sync fences, and memory allocators present severe bottlenecks or crash conditions on MediaTek mobile drivers like the Helio G85.
**Action:** Audit and replace hardcoded Vulkan 1.2 versions to 1.1 across Vulkan initialization. Prioritize non-blocking operations and mobile-friendly staging allocations in future patches.
