# study
practice project
CREATE RETENTION POLICY "rp_vmware_one_week" ON "vmware" DURATION 1w REPLICATION 1 default
CREATE RETENTION POLICY "rp_vmware_one_month" ON "vmware" DURATION 30d REPLICATION 1
CREATE RETENTION POLICY "rp_vmware_three_month" ON "vmware" DURATION 90d REPLICATION 1
CREATE RETENTION POLICY "rp_vmware_one_year" ON "vmware" DURATION 365d REPLICATION 1

create continuous query "cq_vmware_cpu_10min" on "vmware"
begin 
	select min(cpuUsage), max(cpuUsage), mean(cpuUsage) into "vmware"."rp_vmware_one_month"."vmware_vm_cpu_statistics" from "vmware_vm_resource" group by time(10m), center, clusterName, hostName, vmName, vmNameAlias 
end

create continuous query "cq_vmware_cpu_1hour" on "vmware"
begin 
	select min(cpuUsage), max(cpuUsage), mean(cpuUsage) into "vmware"."rp_vmware_three_month"."vmware_vm_cpu_statistics" from "vmware_vm_resource" group by time(1h), center, clusterName, hostName, vmName, vmNameAlias 
end

create continuous query "cq_vmware_cpu_1day" on "vmware"
begin 
	select min(cpuUsage), max(cpuUsage), mean(cpuUsage) into "vmware"."rp_vmware_one_year"."vmware_vm_cpu_statistics" from "vmware_vm_resource" group by time(1d), center, clusterName, hostName, vmName, vmNameAlias 
end

create continuous query "cq_vmware_cpu_mhz_10min" on "vmware"
begin 
	select min(mhz), max(mhz), mean(mhz) into "vmware"."rp_vmware_one_month"."vmware_vm_cpu_mhz_statistics" from "vmware_vm_resource" group by time(10m), center, clusterName, hostName, vmName, vmNameAlias 
end

create continuous query "cq_vmware_cpu_mhz_1hour" on "vmware"
begin 
	select min(mhz), max(mhz), mean(mhz) into "vmware"."rp_vmware_three_month"."vmware_vm_cpu_mhz_statistics" from "vmware_vm_resource" group by time(1h), center, clusterName, hostName, vmName, vmNameAlias 
end

create continuous query "cq_vmware_cpu_mhz_1day" on "vmware"
begin 
	select min(mhz), max(mhz), mean(mhz) into "vmware"."rp_vmware_one_year"."vmware_vm_cpu_mhz_statistics" from "vmware_vm_resource" group by time(1d), center, clusterName, hostName, vmName, vmNameAlias 
end

create continuous query "cq_vmware_costop_10min" on "vmware"
begin 
	select min(costop), max(costop), mean(costop) into "vmware"."rp_vmware_one_month"."vmware_vm_costop_statistics" from "vmware_vm_resource" group by time(10m), center, clusterName, hostName, vmName, vmNameAlias 
end

create continuous query "cq_vmware_costop_1hour" on "vmware"
begin 
	select min(costop), max(costop), mean(costop) into "vmware"."rp_vmware_three_month"."vmware_vm_costop_statistics" from "vmware_vm_resource" group by time(1h), center, clusterName, hostName, vmName, vmNameAlias 
end

create continuous query "cq_vmware_costop_1day" on "vmware"
begin 
	select min(costop), max(costop), mean(costop) into "vmware"."rp_vmware_one_year"."vmware_vm_costop_statistics" from "vmware_vm_resource" group by time(1d), center, clusterName, hostName, vmName, vmNameAlias 
end

create continuous query "cq_vmware_ready_10min" on "vmware"
begin 
	select min(ready), max(ready), mean(ready) into "vmware"."rp_vmware_one_month"."vmware_vm_ready_statistics" from "vmware_vm_resource" group by time(10m), center, clusterName, hostName, vmName, vmNameAlias 
end

create continuous query "cq_vmware_ready_1hour" on "vmware"
begin 
	select min(ready), max(ready), mean(ready) into "vmware"."rp_vmware_three_month"."vmware_vm_ready_statistics" from "vmware_vm_resource" group by time(1h), center, clusterName, hostName, vmName, vmNameAlias 
end

create continuous query "cq_vmware_ready_1day" on "vmware"
begin 
	select min(ready), max(ready), mean(ready) into "vmware"."rp_vmware_one_year"."vmware_vm_ready_statistics" from "vmware_vm_resource" group by time(1d), center, clusterName, hostName, vmName, vmNameAlias 
end

create continuous query "cq_vmware_mem_10min" on "vmware"
begin 
	select min(memoryUsage), max(memoryUsage), mean(memoryUsage) into "vmware"."rp_vmware_one_month"."vmware_vm_mem_statistics" from "vmware_vm_resource" group by time(10m), center, clusterName, hostName, vmName, vmNameAlias 
end

create continuous query "cq_vmware_mem_1hour" on "vmware"
begin 
	select min(memoryUsage), max(memoryUsage), mean(memoryUsage) into "vmware"."rp_vmware_three_month"."vmware_vm_mem_statistics" from "vmware_vm_resource" group by time(1h), center, clusterName, hostName, vmName, vmNameAlias 
end

create continuous query "cq_vmware_mem_1day" on "vmware"
begin 
	select min(memoryUsage), max(memoryUsage), mean(memoryUsage) into "vmware"."rp_vmware_one_year"."vmware_vm_mem_statistics" from "vmware_vm_resource" group by time(1d), center, clusterName, hostName, vmName, vmNameAlias 
end

create continuous query "cq_vmware_mem_active_10min" on "vmware"
begin 
	select min(memory_usage_active), max(memory_usage_active), mean(memory_usage_active) into "vmware"."rp_vmware_one_month"."vmware_vm_mem_active_statistics" from "vmware_vm_resource" group by time(10m), center, clusterName, hostName, vmName, vmNameAlias 
end

create continuous query "cq_vmware_mem_active_1hour" on "vmware"
begin 
	select min(memory_usage_active), max(memory_usage_active), mean(memory_usage_active) into "vmware"."rp_vmware_three_month"."vmware_vm_mem_active_statistics" from "vmware_vm_resource" group by time(1h), center, clusterName, hostName, vmName, vmNameAlias 
end

create continuous query "cq_vmware_mem_active_1day" on "vmware"
begin 
	select min(memory_usage_active), max(memory_usage_active), mean(memory_usage_active) into "vmware"."rp_vmware_one_year"."vmware_vm_mem_active_statistics" from "vmware_vm_resource" group by time(1d), center, clusterName, hostName, vmName, vmNameAlias 
end

create continuous query "cq_vmware_disk_10min" on "vmware"
begin 
	select min(diskUsage), max(diskUsage), mean(diskUsage) into "vmware"."rp_vmware_one_month"."vmware_vm_disk_statistics" from "vmware_vm_disk" group by time(10m), center, clusterName, hostName, vmName, vmNameAlias, diskPath
end

create continuous query "cq_vmware_disk_1hour" on "vmware"
begin 
	select min(diskUsage), max(diskUsage), mean(diskUsage) into "vmware"."rp_vmware_three_month"."vmware_vm_disk_statistics" from "vmware_vm_disk" group by time(1h), center, clusterName, hostName, vmName, vmNameAlias, diskPath 
end

create continuous query "cq_vmware_disk_1day" on "vmware"
begin 
	select min(diskUsage), max(diskUsage), mean(diskUsage) into "vmware"."rp_vmware_one_year"."vmware_vm_disk_statistics" from "vmware_vm_disk" group by time(1d), center, clusterName, hostName, vmName, vmNameAlias, diskPath 
end

create continuous query "cq_vmware_disk_free_10min" on "vmware"
begin 
	select min(free), max(free), mean(free) into "vmware"."rp_vmware_one_month"."vmware_vm_disk_free_statistics" from "vmware_vm_disk" group by time(10m), center, clusterName, hostName, vmName, vmNameAlias, diskPath
end

create continuous query "cq_vmware_disk_free_1hour" on "vmware"
begin 
	select min(free), max(free), mean(free) into "vmware"."rp_vmware_three_month"."vmware_vm_disk_free_statistics" from "vmware_vm_disk" group by time(1h), center, clusterName, hostName, vmName, vmNameAlias, diskPath 
end

create continuous query "cq_vmware_disk_free_1day" on "vmware"
begin 
	select min(free), max(free), mean(free) into "vmware"."rp_vmware_one_year"."vmware_vm_disk_free_statistics" from "vmware_vm_disk" group by time(1d), center, clusterName, hostName, vmName, vmNameAlias, diskPath 
end

create continuous query "cq_vmware_network_10min" on "vmware"
begin 
	select min("in") as "min_in", min("out") as "min_out", max("in") as "max_in", max("out") as "max_out", mean("in") as "mean_in", mean("out") as "mean_out" into "vmware"."rp_vmware_one_month"."vmware_vm_network_statistics" from "vmware_vm_network" group by time(10m), center, clusterName, hostName, vmName, vmNameAlias, nics
end

create continuous query "cq_vmware_network_1hour" on "vmware"
begin 
	select min("in") as "min_in", min("out") as "min_out", max("in") as "max_in", max("out") as "max_out", mean("in") as "mean_in", mean("out") as "mean_out" into "vmware"."rp_vmware_three_month"."vmware_vm_network_statistics" from "vmware_vm_network" group by time(1h), center, clusterName, hostName, vmName, vmNameAlias, nics
end

create continuous query "cq_vmware_network_1day" on "vmware"
begin 
	select min("in") as "min_in", min("out") as "min_out", max("in") as "max_in", max("out") as "max_out", mean("in") as "mean_in", mean("out") as "mean_out" into "vmware"."rp_vmware_one_year"."vmware_vm_network_statistics" from "vmware_vm_network" group by time(1d), center, clusterName, hostName, vmName, vmNameAlias, nics
end

create continuous query "cq_vmware_host_cpu_mhz_10min" on "vmware"
begin 
	select min(cpu_usage_mhz), max(cpu_usage_mhz), mean(cpu_usage_mhz) into "vmware"."rp_vmware_one_month"."vmware_host_cpu_mhz_statistics" from "vmware_host_resource" group by time(10m), center, hostName
end

create continuous query "cq_vmware_host_cpu_mhz_1hour" on "vmware"
begin 
	select min(cpu_usage_mhz), max(cpu_usage_mhz), mean(cpu_usage_mhz) into "vmware"."rp_vmware_three_month"."vmware_host_cpu_mhz_statistics" from "vmware_host_resource" group by time(1h), center, hostName
end

create continuous query "cq_vmware_host_cpu_mhz_1day" on "vmware"
begin 
	select min(cpu_usage_mhz), max(cpu_usage_mhz), mean(cpu_usage_mhz) into "vmware"."rp_vmware_one_year"."vmware_host_cpu_mhz_statistics" from "vmware_host_resource" group by time(1d), center, hostName
end

create continuous query "cq_vmware_host_cpu_10min" on "vmware"
begin 
	select min(cpu_usage_percent), max(cpu_usage_percent), mean(cpu_usage_percent) into "vmware"."rp_vmware_one_month"."vmware_host_cpu_statistics" from "vmware_host_resource" group by time(10m), center, hostName
end

create continuous query "cq_vmware_host_cpu_1hour" on "vmware"
begin 
	select min(cpu_usage_percent), max(cpu_usage_percent), mean(cpu_usage_percent) into "vmware"."rp_vmware_three_month"."vmware_host_cpu_statistics" from "vmware_host_resource" group by time(1h), center, hostName
end

create continuous query "cq_vmware_host_cpu_1day" on "vmware"
begin 
	select min(cpu_usage_percent), max(cpu_usage_percent), mean(cpu_usage_percent) into "vmware"."rp_vmware_one_year"."vmware_host_cpu_statistics" from "vmware_host_resource" group by time(1d), center, hostName
end

create continuous query "cq_vmware_host_mem_10min" on "vmware"
begin 
	select min(memory_usage_percent), max(memory_usage_percent), mean(memory_usage_percent) into "vmware"."rp_vmware_one_month"."vmware_host_mem_statistics" from "vmware_host_resource" group by time(10m), center, hostName
end

create continuous query "cq_vmware_host_mem_1hour" on "vmware"
begin 
	select min(memory_usage_percent), max(memory_usage_percent), mean(memory_usage_percent) into "vmware"."rp_vmware_three_month"."vmware_host_mem_statistics" from "vmware_host_resource" group by time(1h), center, hostName
end

create continuous query "cq_vmware_host_mem_1day" on "vmware"
begin 
	select min(memory_usage_percent), max(memory_usage_percent), mean(memory_usage_percent) into "vmware"."rp_vmware_one_year"."vmware_host_mem_statistics" from "vmware_host_resource" group by time(1d), center, hostName
end

create continuous query "cq_vmware_host_mem_active_10min" on "vmware"
begin 
	select min(memory_usage_active), max(memory_usage_active), mean(memory_usage_active) into "vmware"."rp_vmware_one_month"."vmware_host_mem_active_statistics" from "vmware_host_resource" group by time(10m), center, hostName
end

create continuous query "cq_vmware_host_mem_active_1hour" on "vmware"
begin 
	select min(memory_usage_active), max(memory_usage_active), mean(memory_usage_active) into "vmware"."rp_vmware_three_month"."vmware_host_mem_active_statistics" from "vmware_host_resource" group by time(1h), center, hostName
end

create continuous query "cq_vmware_host_mem_active_1day" on "vmware"
begin 
	select min(memory_usage_active), max(memory_usage_active), mean(memory_usage_active) into "vmware"."rp_vmware_one_year"."vmware_host_mem_active_statistics" from "vmware_host_resource" group by time(1d), center, hostName
end

create continuous query "cq_vmware_host_network_10min" on "vmware"
begin 
	select min("in") as "min_in", min("out") as "min_out", max("in") as "max_in", max("out") as "max_out", mean("in") as "mean_in", mean("out") as "mean_out" into "vmware"."rp_vmware_one_month"."vmware_host_network_statistics" from "vmware_host_network" group by time(10m), center, hostName, nics
end

create continuous query "cq_vmware_host_network_1hour" on "vmware"
begin 
	select min("in") as "min_in", min("out") as "min_out", max("in") as "max_in", max("out") as "max_out", mean("in") as "mean_in", mean("out") as "mean_out" into "vmware"."rp_vmware_three_month"."vmware_host_network_statistics" from "vmware_host_network" group by time(1h), center, hostName, nics
end

create continuous query "cq_vmware_host_network_1day" on "vmware"
begin 
	select min("in") as "min_in", min("out") as "min_out", max("in") as "max_in", max("out") as "max_out", mean("in") as "mean_in", mean("out") as "mean_out" into "vmware"."rp_vmware_one_year"."vmware_host_network_statistics" from "vmware_host_network" group by time(1d), center, hostName, nics
end

bluemix

CREATE RETENTION POLICY "rp_bluemix_one_week" ON "bluemix" DURATION 1w REPLICATION 1 default
CREATE RETENTION POLICY "rp_bluemix_one_month" ON "bluemix" DURATION 30d REPLICATION 1
CREATE RETENTION POLICY "rp_bluemix_three_month" ON "bluemix" DURATION 90d REPLICATION 1
CREATE RETENTION POLICY "rp_bluemix_one_year" ON "bluemix" DURATION 365d REPLICATION 1

bluemix_app

CREATE RETENTION POLICY "rp_bluemix_app_one_week" ON "bluemix_app" DURATION 1w REPLICATION 1 default
CREATE RETENTION POLICY "rp_bluemix_app_one_month" ON "bluemix_app" DURATION 30d REPLICATION 1
CREATE RETENTION POLICY "rp_bluemix_app_three_month" ON "bluemix_app" DURATION 90d REPLICATION 1
CREATE RETENTION POLICY "rp_bluemix_app_one_year" ON "bluemix_app" DURATION 365d REPLICATION 1

create continuous query "cq_bluemix_app_instances_10min" on "bluemix_app"
begin 
	select min(instances), max(instances), mean(instances) into "bluemix_app"."rp_bluemix_app_one_month"."bluemix_app_instances_statistics" from "bluemix_app_info" group by time(10m), center, org, space, app, id
end

create continuous query "cq_bluemix_app_instances_1hour" on "bluemix_app"
begin 
	select min(instances), max(instances), mean(instances) into "bluemix_app"."rp_bluemix_app_three_month"."bluemix_app_instances_statistics" from "bluemix_app_info" group by time(1h), center, org, space, app, id
end

create continuous query "cq_bluemix_app_instances_1day" on "bluemix_app"
begin 
	select min(instances), max(instances), mean(instances) into "bluemix_app"."rp_bluemix_app_one_year"."bluemix_app_instances_statistics" from "bluemix_app_info" group by time(1d), center, org, space, app, id
end

create continuous query "cq_bluemix_app_runningInstance_10min" on "bluemix_app"
begin 
	select min(runningInstance), max(runningInstance), mean(runningInstance) into "bluemix_app"."rp_bluemix_app_one_month"."bluemix_app_runningInstance_statistics" from "bluemix_app_info" group by time(10m), center, org, space, app, id
end

create continuous query "cq_bluemix_app_runningInstance_1hour" on "bluemix_app"
begin 
	select min(runningInstance), max(runningInstance), mean(runningInstance) into "bluemix_app"."rp_bluemix_app_three_month"."bluemix_app_runningInstance_statistics" from "bluemix_app_info" group by time(1h), center, org, space, app, id
end

create continuous query "cq_bluemix_app_runningInstance_1day" on "bluemix_app"
begin 
	select min(runningInstance), max(runningInstance), mean(runningInstance) into "bluemix_app"."rp_bluemix_app_one_year"."bluemix_app_runningInstance_statistics" from "bluemix_app_info" group by time(1d), center, org, space, app, id
end

create continuous query "cq_bluemix_instance_cpuUsage_10min" on "bluemix_app"
begin 
	select min(cpuUsage), max(cpuUsage), mean(cpuUsage) into "bluemix_app"."rp_bluemix_app_one_month"."bluemix_instance_cpuUsage_statistics" from "bluemix_app_instance_info" group by time(10m), center, org, space, host, index, ip
end

create continuous query "cq_bluemix_instance_cpuUsage_1hour" on "bluemix_app"
begin 
	select min(cpuUsage), max(cpuUsage), mean(cpuUsage) into "bluemix_app"."rp_bluemix_app_three_month"."bluemix_instance_cpuUsage_statistics" from "bluemix_app_instance_info" group by time(1h), center, org, space, host, index, ip
end

create continuous query "cq_bluemix_instance_cpuUsage_1day" on "bluemix_app"
begin 
	select min(cpuUsage), max(cpuUsage), mean(cpuUsage) into "bluemix_app"."rp_bluemix_app_one_year"."bluemix_instance_cpuUsage_statistics" from "bluemix_app_instance_info" group by time(1d), center, org, space, host, index, ip
end

create continuous query "cq_bluemix_instance_memUsage_10min" on "bluemix_app"
begin 
	select min(memoryUsage), max(memoryUsage), mean(memoryUsage) into "bluemix_app"."rp_bluemix_app_one_month"."bluemix_instance_memUsage_statistics" from "bluemix_app_instance_info" group by time(10m), center, org, space, host, index, ip
end

create continuous query "cq_bluemix_instance_memUsage_1hour" on "bluemix_app"
begin 
	select min(memoryUsage), max(memoryUsage), mean(memoryUsage) into "bluemix_app"."rp_bluemix_app_three_month"."bluemix_instance_memUsage_statistics" from "bluemix_app_instance_info" group by time(1h), center, org, space, host, index, ip
end

create continuous query "cq_bluemix_instance_memUsage_1day" on "bluemix_app"
begin 
	select min(memoryUsage), max(memoryUsage), mean(memoryUsage) into "bluemix_app"."rp_bluemix_app_one_year"."bluemix_instance_memUsage_statistics" from "bluemix_app_instance_info" group by time(1d), center, org, space, host, index, ip
end

create continuous query "cq_bluemix_instance_diskUsage_10min" on "bluemix_app"
begin 
	select min(diskUsage), max(diskUsage), mean(diskUsage) into "bluemix_app"."rp_bluemix_app_one_month"."bluemix_instance_diskUsage_statistics" from "bluemix_app_instance_info" group by time(10m), center, org, space, host, index, ip
end

create continuous query "cq_bluemix_instance_diskUsage_1hour" on "bluemix_app"
begin 
	select min(diskUsage), max(diskUsage), mean(diskUsage) into "bluemix_app"."rp_bluemix_app_three_month"."bluemix_instance_diskUsage_statistics" from "bluemix_app_instance_info" group by time(1h), center, org, space, host, index, ip
end

create continuous query "cq_bluemix_instance_diskUsage_1day" on "bluemix_app"
begin 
	select min(diskUsage), max(diskUsage), mean(diskUsage) into "bluemix_app"."rp_bluemix_app_one_year"."bluemix_instance_diskUsage_statistics" from "bluemix_app_instance_info" group by time(1d), center, org, space, host, index, ip
end
