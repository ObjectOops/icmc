#!/bin/sh

OPENVSCODE_SERVER_VERSION="1.109.5"
OVSCS_PATH="openvscode-server-v${OPENVSCODE_SERVER_VERSION}-linux-x64"

curl -s -o /dev/null localhost:3000
if [ $? = 0 ]; then
    echo 'Already running.'
    exit 0
fi

echo 'Setting up workbench...'
git clone -q --branch 'binder' --depth 1 'https://github.com/ObjectOops/icmc.git'

echo 'Downloading OpenVSCode Server...'
wget -q -nc "https://github.com/gitpod-io/openvscode-server/releases/download/openvscode-server-v${OPENVSCODE_SERVER_VERSION}/${OVSCS_PATH}.tar.gz"

echo 'Unpacking tarball...'
tar -xzf ${OVSCS_PATH}.tar.gz

echo 'Installing extensions...'
./${OVSCS_PATH}/bin/openvscode-server --install-extension ms-python.python
./${OVSCS_PATH}/bin/openvscode-server --install-extension redhat.java
./${OVSCS_PATH}/bin/openvscode-server --install-extension vscjava.vscode-java-debug
./${OVSCS_PATH}/bin/openvscode-server --install-extension typefox.open-collaboration-tools

echo 'Launching as background process...'
nohup ./${OVSCS_PATH}/bin/openvscode-server --host "0.0.0.0" --port 3000 --without-connection-token > ovscs.log 2>&1 &

echo 'Waiting for startup...'
sleep 5
curl -s -o /dev/null localhost:3000
if [ $? != 0 ]; then
    echo 'Something went wrong.'
    exit 1
fi

echo 'Finished!'
