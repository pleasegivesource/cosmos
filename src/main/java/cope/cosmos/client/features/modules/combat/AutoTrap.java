package cope.cosmos.client.features.modules.combat;

import cope.cosmos.client.features.modules.Category;
import cope.cosmos.client.features.modules.Module;

public class AutoTrap extends Module {
    public AutoTrap() {
        super("AutoTrap", Category.COMBAT, "Traps enemies in obsidian");
    }

    /*

    int previousSlot = -1;
    int trapPlaced = 0;
    EntityPlayer trapTarget = null;
    Rotation trapRotation = new Rotation(Float.NaN, Float.NaN, Rotate.NONE);

    @Override
    public void onUpdate() {
        trapTarget = TargetUtil.getTargetPlayer(targetRange.getValue(), target.getValue());

        if (trapTarget != null) {
            trapPlaced = 0;
            autoTrap(mapTrapPositions());
        }
    }


    public void autoTrap(Iterator<Vec3d> trapPositions) {
        previousSlot = mc.player.inventory.currentItem;

        InventoryUtil.switchToSlot(Item.getItemFromBlock(Blocks.OBSIDIAN), autoSwitch.getValue());

        while (trapPositions.hasNext()) {
            BlockPos trapPosition = new BlockPos(trapTarget.getPositionVector().add(trapPositions.next()));

            if (Objects.equals(BlockUtil.getBlockResistance(trapPosition), BlockResistance.BLANK) && trapPlaced <= blocks.getValue()) {
                if (!rotate.getValue().equals(Rotate.NONE)) {
                    float[] trapAngles = rotateCenter.getValue() ? AngleUtil.calculateCenter(trapPosition) : AngleUtil.calculateAngles(trapPosition);
                    trapRotation = new Rotation((float) (trapAngles[0] + (rotateRandom.getValue() ? ThreadLocalRandom.current().nextDouble(-4, 4) : 0)), (float) (trapAngles[1] + (rotateRandom.getValue() ? ThreadLocalRandom.current().nextDouble(-4, 4) : 0)), rotate.getValue());

                    if (!Float.isNaN(trapRotation.getYaw()) && !Float.isNaN(trapRotation.getPitch()))
                        trapRotation.updateRotations();
                }

                BlockUtil.placeBlock(trapPosition, packet.getValue(), confirm.getValue());
                PlayerUtil.swingArm(swing.getValue());
                trapPlaced++;
            }
        }

        InventoryUtil.switchToSlot(previousSlot, Switch.NORMAL);
    }

    @SubscribeEvent
    public void onPacketSend(PacketEvent.PacketSendEvent event) {
        if (event.getPacket() instanceof CPacketPlayer && !Float.isNaN(trapRotation.getYaw()) && !Float.isNaN(trapRotation.getPitch())) {
            ((ICPacketPlayer) event.getPacket()).setYaw(trapRotation.getYaw());
            ((ICPacketPlayer) event.getPacket()).setPitch(trapRotation.getPitch());
        }
    }

    public Iterator<Vec3d> mapTrapPositions() {
        if (trapTarget != null && trapTarget.onGround) {
            boolean middleX = Math.abs(Math.round(trapTarget.posX) - trapTarget.posX) <= 0.3;
            boolean middleZ = Math.abs(Math.round(trapTarget.posZ) - trapTarget.posZ) <= 0.3;

            if (middleX && middleZ) {

            }

            else if (middleX) {

            }

            else if (middleZ) {
                if (Math.round(trapTarget.posX) - trapTarget.posX < 0) {
                    return Arrays.asList(
                            new Vec3d(0, -1, -1),
                            new Vec3d(1, -1, 0),
                            new Vec3d(0, -1, 1),
                            new Vec3d(-1, -1, 0),
                            new Vec3d(0, 0, -1),
                            new Vec3d(1, 0, 0),
                            new Vec3d(0, 0, 1),
                            new Vec3d(-1, 0, 0),
                            new Vec3d(0, 1, -1),
                            new Vec3d(1, 1, 0),
                            new Vec3d(0, 1, 1),
                            new Vec3d(-1, 1, 0),
                            new Vec3d(0, 2, -1),
                            new Vec3d(0, 2, 1),
                            new Vec3d(0, 2, 0)
                    ).iterator();
                }

                else if (Math.round(trapTarget.posX) - trapTarget.posX > 0) {
                    return Arrays.asList(
                            new Vec3d(0, -1, -1),
                            new Vec3d(1, -1, -1),
                            new Vec3d(1, -1, -1),
                            new Vec3d(0, -1, -2),
                            new Vec3d(1, -1, 0),
                            new Vec3d(0, -1, 1),
                            new Vec3d(-1, -1, 0),
                            new Vec3d(-1, -1, 0),
                            new Vec3d(1, 0, -1),
                            new Vec3d(1, 0, -1),
                            new Vec3d(0, 0, -2),
                            new Vec3d(1, 0, 0),
                            new Vec3d(0, 0, 1),
                            new Vec3d(-1, 0, 0),
                            new Vec3d(-1, 0, 0),
                            new Vec3d(1, 1, -1),
                            new Vec3d(1, 1, -1),
                            new Vec3d(0, 1, -2),
                            new Vec3d(1, 1, 0),
                            new Vec3d(0, 1, 1),
                            new Vec3d(-1, 1, 0),
                            new Vec3d(-1, 1, 0),
                            new Vec3d(0, 2, -1),
                            new Vec3d(0, 2, -2),
                            new Vec3d(0, 2, 1),
                            new Vec3d(0, 2, 0)
                    ).iterator();
                }
            }

            else {
                return Arrays.asList(
                        new Vec3d(0, -1, -1),
                        new Vec3d(1, -1, 0),
                        new Vec3d(0, -1, 1),
                        new Vec3d(-1, -1, 0),
                        new Vec3d(0, 0, -1),
                        new Vec3d(1, 0, 0),
                        new Vec3d(0, 0, 1),
                        new Vec3d(-1, 0, 0),
                        new Vec3d(0, 1, -1),
                        new Vec3d(1, 1, 0),
                        new Vec3d(0, 1, 1),
                        new Vec3d(-1, 1, 0),
                        new Vec3d(0, 2, -1),
                        new Vec3d(0, 2, 1),
                        new Vec3d(0, 2, 0)
                ).iterator();
            }
        }

        return null;
    }

     */
}
